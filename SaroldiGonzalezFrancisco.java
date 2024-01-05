
/**
 * Write a description of class SaroldiGonzalezFrancisco here.
 *
 * @author FranciscoSaroldi-Gonzalez
 * @version 1.0 2024-01-05
 */
public class SaroldiGonzalezFrancisco extends Animal
{
    public SaroldiGonzalezFrancisco() {
        super("Saroldi-Gonzalez Francisco", "maroon", 8);
    }
    
    public String getType() {
        return "Cave Dweller";
    }
    
    public String getName() { 
         return "Crawl";   
    }
    
    public String speak() {
        return "grawa?";
    }
    
    public String getDisposition() {
        return "searching";
    }
}
