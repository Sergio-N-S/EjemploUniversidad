package guia5_2_ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Directorio {

    private HashMap<Integer, Cliente> clientes;

    public Directorio() {
        this.clientes = new HashMap();
    }
    
    public void agregarCliente(Integer nroTel, Cliente cliente) {
        this.clientes.put(nroTel, cliente);
    }
    
    public Cliente buscarCliente(Integer nroTel) {
        Cliente retorno = null;
        if(this.clientes.containsKey(nroTel)) {
            System.out.println("el numero ingresado pertenece a: ");
            retorno= clientes.get(nroTel);
            
        }else {
            System.out.println("El numero ingresado no pertenece al directorio");
        }
        return retorno;
    }
    
    public List buscarTelefono (String apellido) {
        List<Integer> nroAsociado = new ArrayList();
        for (Map.Entry<Integer, Cliente> aux : clientes.entrySet()) {
            Integer key = aux.getKey();
            Cliente value = aux.getValue();
            if(apellido.equals(value.getApellido())){
                nroAsociado.add(key);
            }
        }
       
        return nroAsociado;
    }
    
    public List buscarClientes (String ciudad){
        List<Cliente> clienteAsociado = new ArrayList();
        
    }
}
