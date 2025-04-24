package entities;

public class ErrosOrSucess extends Exception{
    private static final long serialVersionUID = 1l;

    public ErrosOrSucess(String msg){
        super(msg);
    }
}
