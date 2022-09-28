import interfaces.Sharing;
import interfaces.VideoConference;

public class Facebook 
  extends SocialMedia 
  implements VideoConference, Sharing 
{
  @Override
  public void postVideo() {
    System.out.println("Postou um vídeo no Facebook!");
  }

  @Override
  public void postPhoto() {
    System.out.println("Postou uma foto no Facebook!");
  }

  @Override
  public void postComment() {
    System.out.println("Comentou em um post no Facebook!");
  }

  public void doStreaming() {
    System.out.println("Iniciou um vídeo ao vivo no Facebook!");
  }

  public void share() {
    System.out.println("Compartilhou um post do Facebook!");
  }
}
