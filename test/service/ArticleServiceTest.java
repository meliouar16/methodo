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
        Article a = service.ajouterArticle("Règle", 1.5);
        boolean supprimé = service.supprimerArticle(a.getId());
        assertTrue(supprimé);
        assertEquals(0, service.getTousLesArticles().size());
    }

    @Test
    public void testSupprimerArticleInexistant() {
        assertFalse(service.supprimerArticle(999));
    }
}
