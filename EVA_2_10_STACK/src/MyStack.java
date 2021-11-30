public class MyStack extends Lista{
    public int peek() throws Exception {//Regresa el valor del elemento al final  de la lista
        return get((length() - 1));
    }

    public int poll()throws Exception{//Regresa y elimina  el elemento al final de la lisat
        //GUARDAMOS EL VALOR
        int iVal = get((length() - 1));
        //ELIMINAMOS EL VALOR
        delateAt((length() - 1));
        //ENVIAMOS EL VALOR
        return iVal;
    }
}
