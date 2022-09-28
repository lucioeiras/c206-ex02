import interfaces.Sharing;

public class Twitter extends SocialMedia implements Sharing {
  @Override
  public void postVideo() {
    System.out.println("Postou um vídeo no Twitter!");
  }

  @Override
  public void postPhoto() {
    System.out.println("Postou uma foto no Twitter!");
  }

  @Override
  public void postComment() {
    System.out.println("Comentou em um post no Twitter!");
  }

  public void share() {
    System.out.println("Compartilhou um post do Twitter!");
  }
}
