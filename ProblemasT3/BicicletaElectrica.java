public class BicicletaElectrica {
    String id;
    int nivelBateriaActual;
    boolean disponible;
    final static int NIVEL_MINIMO_BATERIA=20;
    int bicicletas=0;

    BicicletaElectrica(String id, int nivelBateria, boolean disponible){
        this.id=id;
        nivelBateriaActual=nivelBateria;
        this.disponible=disponible;
        disponible=true;

        if(nivelBateria>100){
            nivelBateria=100;
        }
        if(nivelBateria<0){
            nivelBateria=0;
        }
        bicicletas++;

    }

    BicicletaElectrica(String id){
        this(id, 100, true);
        bicicletas++;
    }
    }
    

