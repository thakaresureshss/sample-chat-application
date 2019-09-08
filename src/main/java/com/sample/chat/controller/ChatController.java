package com.sample.chat.controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.sample.chat.model.ChatInMessage;
import com.sample.chat.model.ChatOutMessage;

@Controller
public class ChatController {

	@MessageMapping("/guestchat") // here
	@SendTo("/topic/guestchats") // here
	public ChatOutMessage handleMessaging(ChatInMessage message) throws Exception {
		Thread.sleep(1000); // simulated delay
		return new ChatOutMessage(HtmlUtils.htmlEscape(message.getMessage()), null, new Date(),
				message.getSenderName());
	}

	@MessageMapping("/guestupdate")
	@SendTo("/topic/guestupdates")
	public ChatOutMessage handleUserTyping(ChatInMessage message) throws Exception {
		return new ChatOutMessage(message.getSenderName() + " is typing...");
	}

	@MessageMapping("/guestjoin")
	@SendTo("/topic/guestnames")
	public ChatOutMessage handleMemberJoins(ChatInMessage message) throws Exception {
		return new ChatOutMessage(message.getMessage());
	}

	@MessageExceptionHandler
	@SendTo("/topic/errors")
	public ChatOutMessage handleExcpetion(Throwable exception) {
		ChatOutMessage myError = new ChatOutMessage("An error happened.");
		return myError;
	}
}
