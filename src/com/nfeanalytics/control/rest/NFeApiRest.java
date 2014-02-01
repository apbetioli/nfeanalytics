package com.nfeanalytics.control.rest;

import java.util.List;

import javax.persistence.NoResultException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nfeanalytics.model.ApiKeyRepository;
import com.nfeanalytics.model.XmlEntity;
import com.nfeanalytics.model.XmlRepository;
import com.nfeanalytics.util.TransactionalFragment;

@Path("/nfe")
public class NFeApiRest {

	private static final String	API_KEY_HEADER_IS_REQUIRED	= "api-key header is required or is invalid";

	private static final Gson	GSON						= new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
																	.create();

	@GET
	public Response list(@HeaderParam("api-key") @DefaultValue("") String headerKey,
			@QueryParam("api-key") @DefaultValue("") String queryKey) {
		String key = headerKey + queryKey;

		try {
			String user = ApiKeyRepository.getInstance().findUserByKey(key);

			List<XmlEntity> list = XmlRepository.getInstance().findByUser(user);

			return Response.ok(GSON.toJson(list)).type(MediaType.APPLICATION_JSON).build();

		} catch (NoResultException e) {
			return Response.status(401).entity(API_KEY_HEADER_IS_REQUIRED).build();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response post(final String xml, @HeaderParam("api-key") @DefaultValue("") String headerKey,
			@QueryParam("api-key") @DefaultValue("") String queryKey) {
		String key = headerKey + queryKey;

		try {
			final String user = ApiKeyRepository.getInstance().findUserByKey(key);

			TransactionalFragment tx = new TransactionalFragment() {

				@Override
				protected void doInTransaction() throws Exception {
					XmlRepository.getInstance().processar(user, xml.getBytes(), "");
				}

			};
			tx.execute();

			return Response.ok().build();

		} catch (NoResultException e) {
			return Response.status(401).entity(API_KEY_HEADER_IS_REQUIRED).build();
		}
	}

	@GET
	@Path("{chNFe}")
	public Response getXmlEntity(@PathParam("chNFe") String chNFe,
			@HeaderParam("api-key") @DefaultValue("") String headerKey,
			@QueryParam("api-key") @DefaultValue("") String queryKey) {
		String key = headerKey + queryKey;

		try {
			final String user = ApiKeyRepository.getInstance().findUserByKey(key);

			XmlEntity findByChNFe = XmlRepository.getInstance().findByChNFe(chNFe, user);

			return Response.ok(GSON.toJson(findByChNFe)).type(MediaType.APPLICATION_JSON).build();

		} catch (NoResultException e) {
			return Response.status(401).entity(API_KEY_HEADER_IS_REQUIRED).build();
		}
	}

	@DELETE
	@Path("{chNFe}")
	public Response delete(@PathParam("chNFe") final String chNFe,
			@HeaderParam("api-key") @DefaultValue("") String headerKey,
			@QueryParam("api-key") @DefaultValue("") String queryKey) {
		String key = headerKey + queryKey;

		try {
			final String user = ApiKeyRepository.getInstance().findUserByKey(key);

			TransactionalFragment tx = new TransactionalFragment() {

				@Override
				protected void doInTransaction() throws Exception {
					XmlRepository.getInstance().deleteByChNFe(chNFe, user);

				}

			};
			tx.execute();

			return Response.ok().build();

		} catch (NoResultException e) {
			return Response.status(401).entity(API_KEY_HEADER_IS_REQUIRED).build();
		}
	}

	@GET
	@Path("{chNFe}.xml")
	public Response getChaveDownload(@PathParam("chNFe") String chNFe,
			@HeaderParam("api-key") @DefaultValue("") String headerKey,
			@QueryParam("api-key") @DefaultValue("") String queryKey) {
		String key = headerKey + queryKey;

		try {
			final String user = ApiKeyRepository.getInstance().findUserByKey(key);

			XmlEntity findByChNFe = XmlRepository.getInstance().findByChNFe(chNFe, user);
			return Response.ok().header("Content-Disposition", "inline; filename=\"" + chNFe + ".xml\"")
					.type(MediaType.APPLICATION_OCTET_STREAM).entity(findByChNFe.getXml().getBytes()).build();

		} catch (NoResultException e) {
			return Response.status(401).entity(API_KEY_HEADER_IS_REQUIRED).build();
		}
	}

}
