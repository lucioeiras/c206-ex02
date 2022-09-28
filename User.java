public class User {
  String name;
  String email;

  SocialMedia[] socialMedias;

  public User(SocialMedia[] socialMedias) {
    this.socialMedias = socialMedias;
  }
}
