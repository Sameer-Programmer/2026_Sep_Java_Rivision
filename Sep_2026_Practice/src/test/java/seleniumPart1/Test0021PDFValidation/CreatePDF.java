package seleniumPart1.Test0021PDFValidation;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.File;

public class CreatePDF {

    public static void main(String[] args) throws Exception {

        String pdfPath = System.getProperty("user.dir")
                + "\\DemoWebPages\\PurchaseReport.pdf";

        PDDocument document = new PDDocument();

        PDPage page = new PDPage();

        document.addPage(page);

        PDPageContentStream content =
                new PDPageContentStream(document, page);

        // Title
        content.beginText();

        content.setFont(
                new PDType1Font(Standard14Fonts.FontName.HELVETICA_BOLD),
                18
        );

        content.newLineAtOffset(200, 750);

        content.showText("Purchase Report");

        content.endText();


        // Table data
        content.beginText();

        content.setFont(
                new PDType1Font(Standard14Fonts.FontName.HELVETICA),
                12
        );

        content.newLineAtOffset(80, 700);

        content.showText(
                "BookName       PurchasedDate       Amount       Location"
        );

        content.newLineAtOffset(0, -30);

        content.showText(
                "Selenium       29-Jul-2019         350          Africa"
        );

        content.newLineAtOffset(0, -25);

        content.showText(
                "Java           29-Jul-2019         450          India"
        );

        content.newLineAtOffset(0, -25);

        content.showText(
                "Python         30-Jul-2019         500          USA"
        );

        content.endText();

        content.close();

        document.save(pdfPath);

        document.close();

        System.out.println(
                "PDF created successfully:"
        );

        System.out.println(pdfPath);
    }
}