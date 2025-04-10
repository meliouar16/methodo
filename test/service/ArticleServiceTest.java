package service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.List;

public class ArticleServiceTest {

    private ArticleService service;

    @BeforeEach
    public void setup() {
        service = new ArticleService();
    }

    @Test
    public void testAjouterArticle() {
        ArticleService service = new ArticleService();
        Article article = service.ajouterArticle("Stylo", 2.5);
        assertEquals("Stylo", article.getNom()); // test échouera
    }

    @Test
    public void testGetTousLesArticles() {
        List<Article> liste = service.getTousLesArticles();
        assertEquals(2, liste.size());
    }

    @Test
    public void testSupprimerArticle() {

        List<Article> articles = service.getTousLesArticles();
        assertFalse(articles.isEmpty(), "La liste d'articles ne doit pas être vide");

        int tailleAvant = articles.size();
        int idASupprimer = articles.get(0).getId(); // Suppression du premier

        boolean supprimé = service.supprimerArticle(idASupprimer);

        assertTrue(supprimé, "L'article doit être supprimé");
        assertEquals(tailleAvant - 1, service.getTousLesArticles().size(), "La taille doit diminuer de 1");
    }

    @Test
    public void testSupprimerArticleInexistant() {
        assertFalse(service.supprimerArticle(999));
    }
}
