public abstract class fabricaDeBolo {
    public abstract Bolo fabricarBolo();
    
    public void fazerBolo(){    
        Bolo bolo = fabricarBolo();
        bolo.preparar();
        System.out.println("O bolo está pronto! ");
    }
}