public class MyQueue extends Lista{
    //COMO LA FILA DEL SUPERMERCADO
    //LOS ELEMENTOS SE AGREGAN AL FINAL DE LA LISTA
    //METODO ADD--> SIN CAMBIOS
    //SOLO PODEMOS ACCEDER A LOS ELEMENTO AL INICIO DE LA LISTA
    public int peek() throws Exception {//Regresa el valor del elemento al inicio de la lista
        return get(0);
    }

    public int poll()throws Exception{//Regresa y elimina  el elemento al final de la lisat
        //GUARDAMOS EL VALOR
       int iVal = get(0);
        //ELIMINAMOS EL VALOR
        delateAt(0);
        //ENVIAMOS EL VALOR
        return iVal;
    }
}
