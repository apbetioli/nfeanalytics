package com.nfeanalytics.util.generator;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import com.nfeanalytics.util.generator.schema.TNFe.InfNFe.Dest;
import com.nfeanalytics.util.generator.schema.TNFe.InfNFe.Det;
import com.nfeanalytics.util.generator.schema.TNFe.InfNFe.Ide;
import com.nfeanalytics.util.generator.schema.TNFe.InfNFe.Total.ICMSTot;
import com.nfeanalytics.util.generator.schema.TNfeProc;

public class Generator {

	private static final SimpleDateFormat	XML_DATE_FORMAT	= new SimpleDateFormat("yyyy-MM-dd");

	private List<TNfeProc>					trainingData	= new ArrayList<TNfeProc>();

	private Set<Dest>						destinatarios	= new TreeSet<Dest>(new Comparator<Dest>() {

																@Override
																public int compare(Dest o1, Dest o2) {
																	return o1.getXNome().compareTo(o2.getXNome());
																}
															});

	private Set<Det>						produtos		= new TreeSet<Det>(new Comparator<Det>() {

																@Override
																public int compare(Det o1, Det o2) {
																	return o1.getProd().getXProd()
																			.compareTo(o2.getProd().getXProd());
																}
															});

	public void generateFiles(int number, File writeDir) {

		if (!trainingData.iterator().hasNext())
			return;

		double percentual = 100d / number;
		double soma = 0;

		for (int i = 0; i < number; i++) {
			try {
				TNfeProc generate = generate();
				writeFile(generate, writeDir);
			} catch (Exception e) {
				e.printStackTrace();
			}

			soma += percentual;
			System.out.println(((int) soma) + " %");
		}

	}

	private TNfeProc generate() {

		TNfeProc sample = trainingData.iterator().next();

		Ide ide = sample.getNFe().getInfNFe().getIde();
		ide.setDEmi(dEmi());
		ide.setIndPag(indPag());

		sample.getNFe().getInfNFe().setDest(destinatario());

		ICMSTot tot = sample.getNFe().getInfNFe().getTotal().getICMSTot();

		tot.setVICMS(vICMS(tot));
		tot.setVII(ii(tot));
		tot.setVIPI(ipi(tot));
		tot.setVPIS(pis(tot));
		tot.setVCOFINS(cofins(tot));
		tot.setVNF(vNF(tot));
		tot.setVFrete(vFrete(tot));
		tot.setVSeg(vSeg(tot));
		tot.setVDesc(vDesc(tot));
		tot.setVOutro(vOutro(tot));

		sample.getProtNFe().getInfProt().setChNFe(gerarChNFe(sample.getProtNFe().getInfProt().getChNFe()));

		List<Det> dets = sample.getNFe().getInfNFe().getDet();
		dets.clear();
		int qtdProds = (int) (Math.random() * 10) + 1;
		Det[] prods = produtos.toArray(new Det[produtos.size()]);
		for (int i = 0; i < qtdProds; i++) {
			dets.add(customizarDet(prods[(int) (Math.random() * prods.length)]));
		}

		return sample;
	}

	private Det customizarDet(Det det) {
		return det;
	}

	private String vOutro(ICMSTot tot) {
		return vICMS(tot);
	}

	private String vDesc(ICMSTot tot) {
		return vICMS(tot);
	}

	private String vSeg(ICMSTot tot) {
		return vICMS(tot);
	}

	private Dest destinatario() {
		Dest[] array = destinatarios.toArray(new Dest[destinatarios.size()]);
		return array[(int) (Math.random() * array.length)];
	}

	private String indPag() {
		return String.valueOf((int) (Math.random() * 3));
	}

	private String vNF(ICMSTot tot) {
		return new BigDecimal(tot.getVProd())
				.subtract(new BigDecimal(tot.getVICMS()))
				.subtract(new BigDecimal(tot.getVII()))
				.subtract(new BigDecimal(tot.getVIPI()))
				.subtract(new BigDecimal(tot.getVPIS()))
				.subtract(new BigDecimal(tot.getVCOFINS()))
				.subtract(new BigDecimal(tot.getVDesc()))
				.subtract(new BigDecimal(tot.getVFrete()))
				.subtract(new BigDecimal(tot.getVOutro()))
				.abs()
				.setScale(2, RoundingMode.HALF_UP)
				.toString();
	}

	private String vFrete(ICMSTot tot) {
		return vICMS(tot);
	}

	private String cofins(ICMSTot tot) {
		return vICMS(tot);
	}

	private String pis(ICMSTot tot) {
		return vICMS(tot);
	}

	private String ipi(ICMSTot tot) {
		return vICMS(tot);
	}

	private String ii(ICMSTot tot) {
		return vICMS(tot);
	}

	private String dEmi() {
		try {
			long inicio = XML_DATE_FORMAT.parse("2011-01-01").getTime();
			long fim = new Date().getTime();

			long data = (long) ((fim - inicio) * Math.random());

			String gerada = XML_DATE_FORMAT.format(new Date(inicio + data));

			return gerada;

		} catch (ParseException e) {
			e.printStackTrace();
			return XML_DATE_FORMAT.format(new Date());
		}
	}

	private String vICMS(ICMSTot tot) {
		BigDecimal value = new BigDecimal(Math.random() * 0.1 * Double.parseDouble(tot.getVProd()));
		value = value.setScale(2, RoundingMode.HALF_UP);
		return String.valueOf(value);
	}

	private String gerarChNFe(String chNFe) {

		BigInteger bigInteger = new BigInteger(chNFe);
		bigInteger = bigInteger.add(BigInteger.valueOf(System.currentTimeMillis()));
		String newchNFe = bigInteger.toString();
		if (newchNFe.length() > 44)
			newchNFe = newchNFe.substring(0, 44);

		return newchNFe;
	}

	private void processTrainingData() {
		System.out.println("Processing training data");

		for (TNfeProc proc : trainingData) {
			destinatarios.add(proc.getNFe().getInfNFe().getDest());

			for (Det det : proc.getNFe().getInfNFe().getDet())
				produtos.add(det);
		}
	}

	public void loadTrainingData(File readDir) {
		System.out.println("Loading training data");

		File[] files = readDir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.isFile() && file.getName().endsWith(".xml");
			}
		});

		System.out.println(files.length + " to load");

		double percentual = 100d / files.length;
		double soma = 0;

		for (final File file : files) {

			try {
				TNfeProc value = parseXML(file);
				trainingData.add(value);
			} catch (JAXBException e) {
				e.printStackTrace();
			}

			soma += percentual;
			System.out.println(((int) soma) + " %");
		}

		processTrainingData();
	}

	private TNfeProc parseXML(File file) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(TNfeProc.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		TNfeProc proc = (TNfeProc) jaxbUnmarshaller.unmarshal(file);
		return proc;
	}

	private File writeFile(TNfeProc proc, File writeDir) throws JAXBException, IOException {
		JAXBContext jaxbContext = JAXBContext.newInstance(TNfeProc.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		File output = new File(writeDir, proc.getProtNFe().getInfProt().getChNFe() + ".xml");
		writeDir.mkdirs();
		output.createNewFile();

		JAXBElement<TNfeProc> jaxb = new JAXBElement<TNfeProc>(new QName("http://www.portalfiscal.inf.br/nfe",
				"nfeProc"), TNfeProc.class, proc);

		jaxbMarshaller.marshal(jaxb, output);
		return output;
	}

	public static void main(String[] args) {

		File readDir = new File("C:\\Users\\Alexandre\\Desktop\\CompanyB\\Todos");
		File writeDir = new File("C:\\Users\\Alexandre\\Desktop\\Generated\\CompanyB");

		Generator generator = new Generator();

		generator.loadTrainingData(readDir);
		generator.generateFiles(200, writeDir);
	}

}
