public class BicicletaElectrica {
    String id;
    int nivelBateria;
    boolean disponible;
    final static int NIVEL_MINIMO_BATERIA=20;
    static int bicicletas=0;

    BicicletaElectrica(String id, int nivelBateria, boolean disponible){
        this.id=id;
        this.disponible=true;

        if(nivelBateria>100){
            nivelBateria=100;
        }else if(nivelBateria<0){
            nivelBateria=0;
        }else{
            this.nivelBateria=nivelBateria;
        }
        bicicletas++;

    }

    BicicletaElectrica(String id){
        this(id, 100, true);
        bicicletas++;
    }

    String getId(){
        return id;
    }
    static int getBicicletas(){
        return bicicletas;
    }

    void alquilar(){
        if(disponible && nivelBateria>=NIVEL_MINIMO_BATERIA){
            disponible=false;
            System.out.println("Se alquiló con éxito");
        }else{
            System.out.println("NO se alquiló con exito");
        }
    }


    void devolver(int kilometros){
        if(kilometros<0){
            System.out.println("Kilometros negativos");
        }else{
            if(!disponible){
                disponible=true;
                nivelBateria-=kilometros;
                if(nivelBateria<0){
                    nivelBateria=0;
                }
            }
        }
    }

    void tranferirCarga(BicicletaElectrica recibe, int cantidad){
        if(cantidad<=0)
            System.out.println("Cantidad inválida");
        else if(this.nivelBateria<cantidad){
            System.out.println("No tiene batería suficiente");
        }else if(recibe.nivelBateria+catidad>100){
            System.out.println("La cifra supera el maximo de bateria permitido");
        }else{
            this.nivelBateria-=cantidad;
            recibe.nivelBateria+=cantidad;
        }
    }
    }
    

