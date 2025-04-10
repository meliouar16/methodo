package service;

import java.util.*;

public class ArticleService {

    private final Map<Integer, Article> articles = new HashMap<>();

    {
        Article a1 = new Article("Cahier", 3.0);
        Article a2 = new Article("Gomme", 1.0);
        articles.put(a1.getId(), a1);
        articles.put(a2.getId(), a2);
    } // initialiser la hashmap pour utiliser le test de get all pour ne pas dependre
      // de ajoutarticle

    public Article ajouterArticle(String nom, double prix) {
        Article a = new Article(nom, prix);
        articles.put(a.getId(), a);
        return a;
    }

    // public Article ajouterArticle(String nom, double prix) {
    // return null;
    // }

    public boolean supprimerArticle(int id) {
        return articles.remove(id) != null;
    }

    public List<Article> getTousLesArticles() {
        return new ArrayList<>(articles.values());
    }
}
