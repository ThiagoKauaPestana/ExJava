public class App {
    public static void main(String[] args) throws Exception {
        
        RelogioDigital Relogio = new RelogioDigital();

        while(true){
            System.out.println(Relogio.getHorario());
            Thread.sleep(100);
            Relogio.tick();

        }
    

    }
}
