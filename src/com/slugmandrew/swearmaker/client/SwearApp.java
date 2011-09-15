package com.slugmandrew.swearmaker.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class SwearApp extends Composite implements EntryPoint
{
	
	SwearGen sweargen = new SwearGen();
	
	@UiField
	HTML swearLabel;
	
	private static final Binder binder = GWT.create(Binder.class);
	
	interface Binder extends UiBinder<Widget, SwearApp>
	{
	}
	
	public SwearApp()
	{
		initWidget(binder.createAndBindUi(this));
		
	}

	@Override
	public void onModuleLoad()
	{
		
		Widget outer = binder.createAndBindUi(this);
		
		RootPanel root = RootPanel.get();
		
		root.clear();
		
		root.add(outer);
		
	}
	
	@UiHandler("swearButton")
	public void onSwearClick(ClickEvent e)
	{
		String swear = sweargen.swear();
		
		String currentText = swearLabel.getHTML();
		
		swearLabel.setHTML(swear);
		
		//swearLabel.setHTML(currentText + "<br />" + swear);
		
		
	}
	
	
}
