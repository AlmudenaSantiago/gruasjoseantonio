import model.Producto;
import org.junit.Test;
import process.parser.ProductoParserJson;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ProductoParserJsonTest {

    @Test
    public void testParsearListaDeProductosDeUnPedido(){
        ProductoParserJson parserJson = new ProductoParserJson();
        List<Producto> listProducto = parserJson.parsear(crearListaProductoPedido());
        assertTrue(listProducto.size() == 2);
    }

    private String crearListaProductoPedido() {
        return "[" +
                    "{" +
                        "\"id\":1," +
                        "\"nombre\":\"Caracol Cabrilla (Congelado)\"," +
                        "\"descripcion\":\"Caracol Cabrilla (Congelado)\"," +
                        "\"stock\":10," +
                        "\"precio\":1.00," +
                        "\"categoria\":1," +
                        "\"pivot\":" +
                                        "{" +
                                            "\"pedido_id\": 20," +
                                            "\"producto_id\": 1," +
                                            "\"cantidad\": 2.00" +
                                        "}" +
                    "}," +
                    "{" +
                        "\"id\":2," +
                        "\"nombre\":\"Caracol Cabrilla (VIVO)\"," +
                        "\"descripcion\":\"Caracol Cabrilla (VIVO)\"," +
                        "\"stock\":10," +
                        "\"precio\":1.00," +
                        "\"categoria\":1," +
                        "\"pivot\": {" +
                                        "\"pedido_id\":20," +
                                        "\"producto_id\":2," +
                                        "\"cantidad\":3.00" +
                                    "}"+
                    "}"+
                "]";
    }
}
