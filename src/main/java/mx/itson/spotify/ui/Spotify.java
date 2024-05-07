/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.ui;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.spotify.entities.*; // El "*" es para importar todas las clases de "x" paquete en dado caso ocupes todas las clases o la mayoria.


/**
 *
 * @author alumnog
 */
public class Spotify {
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Ezkai");
        artista.setPerfil("Artista versatil");
        artista.setOyentesMensuales(100000);
        artista.setFollowers(550000);
        
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Lo minimo");
        cancion1.setDuracion(180);
        
        Cancion cancion2 = new Cancion();
        cancion2.setTitulo("Villain");
        cancion2.setDuracion(200);
        
        List<Cancion> temas = new ArrayList<>();
        temas.add(cancion1);
        temas.add(cancion2);
        
        Album album = new Album();
        album.setNombre("Rain");
        album.setArtista(artista);
        album.setFechaLanzamiento(new Date());
        album.setCanciones(temas);
        album.setGenero("Pop");
        
        
        System.out.println(album.getNombre());
        System.out.println(album.getArtista().getNombre());
        System.out.println(album.getArtista().getPerfil());
        System.out.println(album.getArtista().getFollowers());
        System.out.println(album.getArtista().getOyentesMensuales());
        System.out.println(album.getFechaLanzamiento());
        System.out.println(album.getGenero());
        for(Cancion c : album.getCanciones()){
            int num = 0;
            System.out.println(c.getTitulo());
            System.out.println(c.getDuracion());
            num= +1;
            
        }
        //System.out.println(num+ album.getCanciones());
        
        
        
    }
}
