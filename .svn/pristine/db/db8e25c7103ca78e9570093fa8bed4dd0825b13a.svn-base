package com.nfeanalytics.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.text.WordUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.nfeanalytics.model.DetEntity;
import com.nfeanalytics.model.NFeEntity;

public class XMLUtils {

	private static final Map<String, Object>				cache		= new LinkedHashMap<String, Object>();

	private static final Map<String, Map<String, Object>>	dets		= new LinkedHashMap<String, Map<String, Object>>();

	private static String									currentDet	= "1";

	public static NFeEntity parseXMLNFeEDet(InputStream file, String userEmail) throws ParserConfigurationException,
			SAXException, IOException, SecurityException, IllegalArgumentException,
			InstantiationException, IllegalAccessException, InvocationTargetException {

		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

		Document doc = dBuilder.parse(file);

		Element root = doc.getDocumentElement();

		if (root.hasChildNodes()) {
			popularMap(root.getChildNodes(), root.getNodeName());
		}

		NFeEntity nfe = criarEntity(userEmail);

		criarDets(nfe);

		return nfe;

	}

	private static void popularMap(NodeList nodeList, String parentNodeName) {

		for (int count = 0; count < nodeList.getLength(); count++) {

			Node node = nodeList.item(count);

			if (node.getNodeType() == Node.TEXT_NODE) {

				if (node.getNodeValue() != null && !node.getNodeValue().trim().isEmpty()) {

					if (parentNodeName.startsWith("nfeProc_NFe_infNFe_det")) {

						synchronized (dets) {
							dets.get(currentDet).put(parentNodeName, node.getNodeValue().trim());
						}

					} else {

						synchronized (cache) {
							cache.put(parentNodeName, node.getNodeValue().trim());
						}
					}

				}

			} else if (node.getNodeType() == Node.ELEMENT_NODE) {

				String nodeName = parentNodeName + "_" + node.getNodeName();

				if (node.hasAttributes()) {

					NamedNodeMap attributes = node.getAttributes();

					for (int i = 0; i < attributes.getLength(); i++) {

						Node attribute = attributes.item(i);

						String fullNodeName = nodeName + "_" + attribute.getNodeName();

						if ("nfeProc_NFe_infNFe_det_nItem".equals(fullNodeName)) {
							currentDet = attribute.getNodeValue();
							synchronized (dets) {
								dets.put(currentDet, new LinkedHashMap<String, Object>());
							}

						} else {
							synchronized (cache) {
								cache.put(fullNodeName, attribute.getNodeValue());
							}
						}

					}

				}

				if (node.hasChildNodes()) {
					popularMap(node.getChildNodes(), nodeName);
				}

			}

		}

	}

	private static NFeEntity criarEntity(String userEmail) throws InstantiationException, IllegalAccessException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		NFeEntity nfe = new NFeEntity(userEmail);

		synchronized (cache) {
			for (Entry<String, Object> entry : cache.entrySet()) {
				invokeMethodsNFe(nfe, entry);
			}
		}

		return nfe;

	}

	private static void invokeMethodsNFe(NFeEntity nfe, Entry<String, Object> entry) {

		Class classRefNFe = nfe.getClass();
		try {
			Method declaredMethodNFe = classRefNFe.getDeclaredMethod(
					"set" + WordUtils.capitalize(entry.getKey()), entry.getValue().getClass());
			declaredMethodNFe.invoke(nfe, entry.getValue());

		} catch (NoSuchMethodException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void criarDets(NFeEntity nfe) {
		List<DetEntity> lista = new LinkedList<DetEntity>();

		synchronized (dets) {
			for (Entry<String, Map<String, Object>> entry : dets.entrySet()) {

				DetEntity det = new DetEntity(nfe);

				for (Entry<String, Object> entry2 : entry.getValue().entrySet()) {
					invokeMethodsDet(det, entry2);
				}

				lista.add(det);
			}
		}

		nfe.setDets(lista);

	}

	private static void invokeMethodsDet(DetEntity det, Entry<String, Object> entry2) {
		Class classRefDet = det.getClass();
		try {
			Method declaredMethodNFe = classRefDet.getDeclaredMethod(
					"set" + WordUtils.capitalize(entry2.getKey()), entry2.getValue().getClass());
			declaredMethodNFe.invoke(det, entry2.getValue());
		} catch (NoSuchMethodException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
