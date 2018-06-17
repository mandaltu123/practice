package java8.objectorientation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * This is one example of implementation of strategy pattern using lambdas
 */
public class Asset {

    public enum AssetType {BOND, STOCK}

    private final AssetType assetType;
    private final int assetValue;

    public Asset(AssetType assetType, int assetValue) {
        this.assetType = assetType;
        this.assetValue = assetValue;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public int getAssetValue() {
        return assetValue;
    }
}

class AssetUtil {

    public static int totalAssetValue(final List<Asset> assets,
                                      final Predicate<Asset> assetSelector) {
        return assets.stream()
                .filter(assetSelector)
                .mapToInt(Asset::getAssetValue).sum();
    }
}

class AssetTester {
    public static void main(String[] args) {
        final List<Asset> assets = Arrays.asList(
                new Asset(Asset.AssetType.BOND, 1000),
                new Asset(Asset.AssetType.BOND, 2000),
                new Asset(Asset.AssetType.STOCK, 3000),
                new Asset(Asset.AssetType.STOCK, 4000)
        );

        System.out.println("All assets: " +
                AssetUtil.totalAssetValue(assets, asset -> true));

        System.out.println("Total of bonds: " +
                AssetUtil.totalAssetValue(assets, asset -> asset.getAssetType() == Asset.AssetType.BOND));
        System.out.println("Total of stocks: " +
                AssetUtil.totalAssetValue(assets, asset -> asset.getAssetType() == Asset.AssetType.STOCK));
    }
}
