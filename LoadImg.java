public class LoadImg{

  private GraphicsPanel graphics = new GraphicsPanel();
  private String ImgSword = "sword.jpg";
  private String ImgGrass1 = "GRASS.jpg";
  private String ImgGrass2 = "GRASSOp.jpg";
  private String ImgMoney = "COIN.jpg";


  public LoadImg(){

    graphics.getObj("GRASS0").loadimg(graphics.getObj("GRASS0").getId()+"0",ImgGrass1);
    graphics.getObj("GRASS0").loadimg(graphics.getObj("GRASS0").getId()+"1",ImgGrass2);
    graphics.getObj("SWORD").loadimg(graphics.getObj("SWORD").getId(),ImgSword);
    graphics.getObj("MONEY").loadimg(graphics.getObj("MONEY").getId(),ImgMoney);

  }


}
