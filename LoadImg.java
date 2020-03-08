public class LoadImg{

  private GraphicsPanel graphics = new GraphicsPanel();
  private String ImgSword = "sword.jpg";
  private String ImgGrass1 = "GRASS.jpg";
  private String ImgGrass2 = "GRASSOp.jpg";
  private String ImgMoney = "COIN.jpg";


  public LoadImg(){
    // set the key to the id of the object ur trying to add and if there are multiply images to an pickble object ur fucked so u.. know don't
    graphics.getObj("GRASS0").loadimg(graphics.getObj("GRASS0").getId()+"0",ImgGrass1);
    graphics.getObj("GRASS0").loadimg(graphics.getObj("GRASS0").getId()+"1",ImgGrass2);
    graphics.getObj("SWORD").loadimg(graphics.getObj("SWORD").getId(),ImgSword);
    graphics.getObj("MONEY").loadimg(graphics.getObj("MONEY").getId(),ImgMoney);

  }


}
