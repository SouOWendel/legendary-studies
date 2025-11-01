package factory;

public abstract class ProductFactory {
	
	public static Product CreateProduct(String tipoProduto) {
		if(tipoProduto == "Book") {
			return new BookProduct();
		} else if (tipoProduto == "Clothing") {
			return new ClothingProduct();
		} else if (tipoProduto == "Electronics") {
			return new ElectronicsProduct();
		} else {
			System.out.println("Erro: informe um tipo de produto valido (Book/Clothing/Electronics).");
		}
		return null;
	}
}
