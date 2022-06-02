package got.java.dev6.module7;


class TexturePoolTest {
    public static void main(StringExample[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}

class TexturePool {
    private static TexturePool instance = new TexturePool();

    private TexturePool() {
        throw new RuntimeException("Constructor not allowed");
    }

    public static TexturePool getInstance() {
        return instance;
    }

    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }
}
