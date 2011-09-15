package com.slugmandrew.swearmaker.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gwt.user.client.Random;

public class SwearGen
{
	String[] swear = new String[3];
	String[] lastSwear = new String[3];
	
	private List<String> first = new ArrayList<String>();
	private List<String> second = new ArrayList<String>();
	private List<String> third = new ArrayList<String>();
	
	private List<List<String>> parts = new ArrayList<List<String>>();
	
	public SwearGen()
	{
		
		addWords();
		
		parts.add(first);
		parts.add(second);
		parts.add(third);
		
	}
	
	public String swear()
	{
		
		// for each part of the swear
		for(int i = 0; i < 3; i++)
		{
			// generate a part
			String partToAdd = parts.get(i).get(Random.nextInt(parts.get(i).size()));
			
			// if it's the same as before
			while(partToAdd == lastSwear[i])
			{
				// generate it again
				partToAdd = parts.get(i).get(Random.nextInt(parts.get(i).size()));
			}
			
			swear[i] = partToAdd;
			
		}
		
		lastSwear = swear;
		
		return capitalize("Thou " + swear[0] + " " + swear[1] + " " + swear[2]);
	}
	
	private String capitalize(String string)
	{
		final StringBuilder result = new StringBuilder(string.length());
		
		String[] words = string.split("\\s");
		
		for(int i = 0, l = words.length; i < l; ++i)
		{
			if(i > 0)
				result.append(" ");
			result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
			
		}
		
		return result.toString();
	}
	
	private void addWords()
	{
		/*
		 * String text =
		 * "artless base-court apple-john bawdy bat-fowling baggage beslubbering beef-witted barnacle bootless beetle-headed bladder churlish boil-brained boar-pig cockered clapper-clawed bugbear clouted clay-brained bum-bailey craven common-kissing canker-blossom currish crook-pated clack-dish dankish dismal-dreaming clotpole dissembling dizzy-eyed coxcomb droning doghearted codpiece errant dread-bolted death-token fawning earth-vexing dewberry fobbing elf-skinned flap-dragon froward fat-kidneyed flax-wench frothy fen-sucked flirt-gill gleeking flap-mouthed foot-licker goatish fly-bitten fustilarian gorbellied folly-fallen giglet impertinent fool-born gudgeon infectious full-gorged haggard jarring guts-griping harpy loggerheaded half-faced hedge-pig lumpish hasty-witted horn-beast mammering hedge-born hugger-mugger mangled hell-hated joithead mewling idle-headed lewdster paunchy ill-breeding lout pribbling ill-nurtured maggot-pie puking knotty-pated malt-worm puny milk-livered mammet qualling motley-minded measle rank onion-eyed minnow reeky plume-plucked miscreant roguish pottle-deep moldwarp ruttish pox-marked mumble-news saucy reeling-ripe nut-hook spleeny rough-hewn pigeon-egg spongy rude-growing pignut surly rump-fed puttock tottering shard-borne pumpion unmuzzled sheep-biting ratsbane vain spur-galled scut venomed swag-bellied skainsmate villainous tardy-gaited strumpet warped tickle-brained varlot wayward toad-spotted vassal weedy unchin-snouted whey-face yeasty weather-bitten wagtail"
		 * ;
		 * 
		 * String result = text.replaceAll(" ", ":");
		 * 
		 * System.out.println(result);
		 * 
		 * String[] resultArray = result.split(":");
		 * 
		 * System.out.println(resultArray.length);
		 * System.out.println(Arrays.toString(resultArray));
		 * 
		 * String[] one = new String[50];
		 * String[] two = new String[50];
		 * String[] three = new String[50];
		 * 
		 * for(int i = 0; i < 50; i++)
		 * {
		 * one[i] = resultArray[i*3];
		 * two[i] = resultArray[(i*3)+1];
		 * three[i] = resultArray[(i*3)+2];
		 * }
		 * 
		 * for(int i = 0; i < 50; i++)
		 * {
		 * System.out.print("\"" + one[i] + "\", ");
		 * }
		 * System.out.println();
		 * for(int i = 0; i < 50; i++)
		 * {
		 * System.out.print("\"" + two[i] + "\", ");
		 * }
		 * System.out.println();
		 * for(int i = 0; i < 50; i++)
		 * {
		 * System.out.print("\"" + three[i] + "\", ");
		 * }
		 * System.out.println();
		 */

		String[] firstArray = { "artless", "bawdy", "beslubbering", "bootless", "churlish", "cockered", "clouted", "craven", "currish", "dankish", "dissembling", "droning", "errant", "fawning", "fobbing", "froward", "frothy", "gleeking", "goatish", "gorbellied", "impertinent", "infectious", "jarring", "loggerheaded", "lumpish", "mammering", "mangled", "mewling", "paunchy", "pribbling", "puking",
				"puny", "qualling", "rank", "reeky", "roguish", "ruttish", "saucy", "spleeny", "spongy", "surly", "tottering", "unmuzzled", "vain", "venomed", "villainous", "warped", "wayward", "weedy", "yeasty" };
		String[] secondArray = { "base-court", "bat-fowling", "beef-witted", "beetle-headed", "boil-brained", "clapper-clawed", "clay-brained", "common-kissing", "crook-pated", "dismal-dreaming", "dizzy-eyed", "doghearted", "dread-bolted", "earth-vexing", "elf-skinned", "fat-kidneyed", "fen-sucked", "flap-mouthed", "fly-bitten", "folly-fallen", "fool-born", "full-gorged", "guts-griping",
				"half-faced", "hasty-witted", "hedge-born", "hell-hated", "idle-headed", "ill-breeding", "ill-nurtured", "knotty-pated", "milk-livered", "motley-minded", "onion-eyed", "plume-plucked", "pottle-deep", "pox-marked", "reeling-ripe", "rough-hewn", "rude-growing", "rump-fed", "shard-borne", "sheep-biting", "spur-galled", "swag-bellied", "tardy-gaited", "tickle-brained", "toad-spotted",
				"unchin-snouted", "weather-bitten" };
		String[] thirdArray = { "apple-john", "baggage", "barnacle", "bladder", "boar-pig", "bugbear", "bum-bailey", "canker-blossom", "clack-dish", "clotpole", "coxcomb", "codpiece", "death-token", "dewberry", "flap-dragon", "flax-wench", "flirt-gill", "foot-licker", "fustilarian", "giglet", "gudgeon", "haggard", "harpy", "hedge-pig", "horn-beast", "hugger-mugger", "joithead", "lewdster",
				"lout", "maggot-pie", "malt-worm", "mammet", "measle", "minnow", "miscreant", "moldwarp", "mumble-news", "nut-hook", "pigeon-egg", "pignut", "puttock", "pumpion", "ratsbane", "scut", "skainsmate", "strumpet", "varlot", "vassal", "whey-face", "wagtail" };
		
		first.addAll(Arrays.asList(firstArray));
		second.addAll(Arrays.asList(secondArray));
		third.addAll(Arrays.asList(thirdArray));
		
	}
	
}
