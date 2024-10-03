public class Principal {
   public static void main(String[] args){
    
    fabricaDeBolo boloChocolate = new prepararBoloChocolate();
    boloChocolate.fazerBolo();

    fabricaDeBolo boloMorango = new prepararBoloMorango();
    boloMorango.fazerBolo();

    fabricaDeBolo boloAbacaxi = new prepararBoloAbacaxi();
    boloAbacaxi.fazerBolo();

    fabricaDeBolo boloCenoura = new prepararBoloCenoura();
    boloCenoura.fazerBolo();
    }
}