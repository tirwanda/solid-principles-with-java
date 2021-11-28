package tirwanda.dev.solid.lsp;

public abstract class SocialMedia {

    // it will support WhatsApp, Facebook, Instagram
    public abstract void chatWithFriend();

    // it will support Facebook, Instagram
    public abstract void publishPost(Object Post);

    // it will support WhatsApp, Facebook, Instagram
    public abstract void sendPhotosAndVideos();

    // it will support WhatsApp, Facebook
    public abstract void groupVideoCall(String... user);
}
