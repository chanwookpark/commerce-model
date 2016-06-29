package commerce.service;

import commerce.Sku;

import java.util.List;

/**
 * @author chanwook
 */
public interface ProductRepository {

    List<Sku> findSku(List<Long> skuIdList);

    Sku findSku(long skuId);
}
