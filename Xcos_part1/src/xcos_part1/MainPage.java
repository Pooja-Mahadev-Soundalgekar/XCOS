//Name:Pooja Mahadev Soundalgekar
//National Institute of Technology Karnataka
//Input: Hex values for Background and foreground color and String for the text.	
//Output:The properties of the label change according to the input. If any field is left empty, it retains the property.	
//Resource:www.javapoint.com
//         www.w3schools.in
//	   stackoverflow.com																							   //


package xcos_part1;

/**
 *
 * @author Pooja M S
 */
public class MainPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.awt.EventQueue.invokeLater(new Runnable() 
		 {
	            public void run() 
	            {
	                new PopupBox();
	            }
	     }); 
    }
    
}
