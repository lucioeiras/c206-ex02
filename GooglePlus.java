import interfaces.Sharing;
import interfaces.VideoConference;

public class GooglePlus 
  extends SocialMedia 
  implements VideoConference, Sharing 
{
  @Override
  public void postVideo() {
    System.out.println("Postou um vídeo no GooglePlus!");
  }

  @Override
  public void postPhoto() {
    System.out.println("Postou uma foto no GooglePlus!");
  }

  @Override
  public void postComment() {
    System.out.println("Comentou em um post no GooglePlus!");
  }

  public void doStreaming() {
    System.out.println("Iniciou um vídeo ao vivo no GooglePlus!");
  }

  public void share() {
    System.out.println("Compartilhou um post do GooglePlus!");
  }
}
