	//import java.awt.print.Book;

	//import java.awt.print.PageFormat;
	//import java.awt.print.Paper;
	//import java.awt.print.PrinterException;
	import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
	//import java.io.File;
	//import java.io.IOException;
	//import javax.print.attribute.HashPrintRequestAttributeSet;
	//import javax.print.attribute.PrintRequestAttributeSet;
	//import javax.print.attribute.standard.PageRanges;
	//import javax.print.attribute.standard.Sides;
	import org.apache.pdfbox.pdmodel.PDDocument;
	//import org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences;
	import org.apache.pdfbox.printing.PDFPageable;
	//import org.apache.pdfbox.printing.PDFPrintable;

	/**
	 * Examples of various different ways to print PDFs using PDFBox.
	 */
	public final class Printing{
		public void print(PDDocument document) throws PrinterException
			    {
					
			        PrinterJob job = PrinterJob.getPrinterJob();
			        job.setPageable(new PDFPageable(document));
			        job.print();
			      
					}
			    }
	
	

