package com.orientacaoobjetos.youtube;

public class ProjetoYoutube {

  public static void main(String[] args) {
    
    Video v[] = new Video[3];
    v[0] = new Video("Aula 14 de POO");
    v[1] = new Video("Aula 15 de Java");
    v[2] = new Video("Aula 2 de Spring Boot");
    
    Gafanhoto g[] = new Gafanhoto[2];
    g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
    g[1] = new Gafanhoto("Creuza", 19, "F", "creuzita");
    
    Visualizacao vis[] = new Visualizacao[5];
    vis[0] = new Visualizacao(g[0], v[0]); // Jubileu assitindo POO
    vis[0].avaliar();
    System.out.println(vis[0].toString());
    
    vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assistindo Java
    vis[1].avaliar(4);
    System.out.println(vis[0].toString());
    
    
    /*
    System.out.println("Vídeos\n--------------------");
    *System.out.println(v[0].toString());
    *System.out.println(v[1].toString());
    *System.out.println(v[2].toString());
    *System.out.println("\nGafanhotos\n--------------------");
    *System.out.println(g[0].toString());
    *System.out.println(v[1].toString());
    */  
    
  }

}