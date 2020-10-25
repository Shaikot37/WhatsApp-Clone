package com.essam.chatapp.ui.chat.activity;

import com.essam.chatapp.models.Message;
import com.essam.chatapp.models.Chat;

public interface ChatCallBacks {

    void onCheckPreviousConversationWithThisUser(boolean isFirstTime, Chat chat);

    void onCheckFirstTimeChat(boolean isFirstTime);

    void onNewMessageAdded(Message message);

    void onMessageSeen(String messageId);
}
