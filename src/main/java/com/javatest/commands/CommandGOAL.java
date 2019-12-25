package com.javatest.commands;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.javatest.main.MainClass;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class CommandGOAL extends CommandBase 
{
	private final List<String> aliases = Lists.newArrayList(MainClass.MODID, "goal", "sonygoal", "tellmeaboutgoal", "wtfisgoal", "iveneverheardofgoal");

	@Override
	public String getCommandName() {
		return "gameorientedassemblylisp";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "/goal Tells you a little bit about GOAL, amirite?";
	}

	@Override
	public List getCommandAliases()
	{
	    ArrayList al = new ArrayList<String>();
	    al.add("goal");
	    al.add("sonygoal"); //if needed
	    al.add("tellmeaboutgoal"); //if needed
	    al.add("wtfisgoal");
	    al.add("iveneverheardofgoal");
	    return this.aliases;
	}
	
	@Override
	public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_) {
		p_71515_1_.addChatMessage(new ChatComponentText("Game Oriented Assembly Lisp is a programming language, a dialect of the Lisp language, specifically designed for video games for PlayStation 2, 3, and PSP. It is developed by Andy Gavin and the Jak and Daxter team at the company Naughty Dog. GOAL's syntax resembles the Lisp dialect Scheme, though with many object-oriented programming features such as classes, inheritance, and virtual functions."));
		p_71515_1_.addChatMessage(new ChatComponentText("GOAL does not run in an interpreter, but instead is compiled directly into PlayStation 2 machine code to execute. It offers limited facilities for garbage collection, relying extensively on runtime support. It offers dynamic memory allocation primitives designed to make it well-suited to running in constant memory on a video game console. GOAL has extensive support for inlined assembly language using a special 'rlet' form, allowing programs to freely mix assembly and higher-level constructs within one function."));
		p_71515_1_.addChatMessage(new ChatComponentText("Source: Wikipedia"));
	}
	
}
