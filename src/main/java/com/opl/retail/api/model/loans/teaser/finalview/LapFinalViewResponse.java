package com.opl.retail.api.model.loans.teaser.finalview;

import java.io.Serializable;

import com.opl.retail.api.model.loans.teaser.primaryview.LapPrimaryViewResponse;



public class LapFinalViewResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LapPrimaryViewResponse lapPrimaryViewResponse;
	private RetailFinalViewResponse finalViewResponse;

	public LapPrimaryViewResponse getLapPrimaryViewResponse() {
		return lapPrimaryViewResponse;
	}

	public void setLapPrimaryViewResponse(LapPrimaryViewResponse lapPrimaryViewResponse) {
		this.lapPrimaryViewResponse = lapPrimaryViewResponse;
	}

	public RetailFinalViewResponse getFinalViewResponse() {
		return finalViewResponse;
	}

	public void setFinalViewResponse(RetailFinalViewResponse finalViewResponse) {
		this.finalViewResponse = finalViewResponse;
	}
	
	
}
