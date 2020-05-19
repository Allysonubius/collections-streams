package com.example.CollectionsStreams.Map;
import java.util.Map;
public class HashMap {
    public static void main(String[]args) {
        Map<String, Integer> campeoesFifa = new java.util.HashMap<> ();
        //Adiciona os campeos mundiais fifa no mapa
        campeoesFifa.put ("Brasil",5);
        campeoesFifa.put ("Alemanha",4);
        campeoesFifa.put ("Italia",4);
        campeoesFifa.put ("Uruguai",2);
        campeoesFifa.put ("Argentina",2);
        campeoesFifa.put ("França",2);
        campeoesFifa.put ("Inglaterra",1);
        campeoesFifa.put ("Espanha",1);
        //Impressão da fila de times
        System.out.println (campeoesFifa);
        //Atualiza o valor para a chave Brasil
        campeoesFifa.put("Brasil",6);
        //Impressão com metodo PUT
        System.out.println (campeoesFifa);
        //Retorna a Argentina
        System.out.println (campeoesFifa.get("Argentina"));
        //Retorna se existe ou não um campão França
        System.out.println (campeoesFifa.containsKey ("França"));
        //Remove o campeão França
        campeoesFifa.remove ("França");
        //Retorna se existe o nãio um campeao França
        System.out.println (campeoesFifa.containsKey ("França"));
        //Retorna se existe ou não alguma seleção hexa campea
        System.out.println (campeoesFifa.containsValue (6));
        //Retorna o tamanho do mapa
        System.out.println (campeoesFifa.size());
        //Impressão da lista
        System.out.println (campeoesFifa);
        //Navega nos registros do mapa
        for(Map.Entry<String,Integer> entry: campeoesFifa.entrySet ()){
            //Impressao do metodo getKey
            System.out.println (entry.getKey ()+ "---" +entry.getKey ());
        }
        //Navega nos registros do mapa
        for(String key: campeoesFifa.keySet ()){
            //Impressoa do metodo get(key)
            System.out.println (key + "---" + campeoesFifa.get (key));
        }
        //Impressoa da lista
        System.out.println (campeoesFifa);
        //Verifica se o mapa contem a chave Estados Unidos
        System.out.println (campeoesFifa.containsKey ("Estados Unidos"));
        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println (campeoesFifa.size ());
        //Impressão da Lista
        System.out.println (campeoesFifa);
        //Limpando a Lista
        campeoesFifa.clear ();
        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println (campeoesFifa.size ());

    }
}
