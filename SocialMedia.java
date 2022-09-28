public abstract class SocialMedia {
  protected String password;
  protected int numberOfFriends;

  abstract public void postPhoto();

  abstract public void postVideo();

  abstract public void postComment();

  public void likePost() {
    System.out.println("Curtiu uma publicação!");
  }
} 