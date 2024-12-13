package org.example.lsp;

public abstract class SocialMedia {
    public abstract void chatWithFriend();
    public abstract void publishPost(Object post);
//    string... syntax is a feature called varargs (variable-length arguments).
//    It allows a method to accept zero or more arguments of the specified type, in this case, String.
    public abstract void groupVideoCall(String... users);

}
