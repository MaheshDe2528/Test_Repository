/**
 * Viewmodel for Response:Every service should return a response.
 */

package com.springCRUDDemo.viewmodel;

import java.util.List;
//import play.libs.Json;

import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * The Response deals with the response send back for a request. all result type
 * will be declared in response and will be set before sending it.
 * 
 * @author DivyaP
 * @since 2014-09-10
 */

public class Response {

	// This states whether the request was success or not and is sent back to
	// ajax call.
	public Boolean success;
	// This field holds the appropriate message which is sent back to ajax call.
	public String message;
	// This field contains the proper exception message if any.
	public String ExceptionMessage;
	// This field contains the list returned from the service layer.
	public List<?> ViewModels;
	// This field contains the object/pojo returned from the service layer.
	public Object ViewModel;
	// This field contains the json object returned from the service layer.
//	public ObjectNode data = Json.newObject();
	public Boolean status;
	public Integer TotalPages;

}