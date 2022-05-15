package org.crazyit.cloud;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class EncryptMain {

	public static void main(String[] args) throws Exception {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost("http://localhost:8888/decrypt");

//		HttpEntity entity = new StringEntity(
//				"d66686d141af00491ad917f09f958c3e202e2672edd980f413f4c2ede4aa5d43",
//				Consts.UTF_8);

		String passwd = "AQBia6j3o4vixRoqINL0eX+dAcrMrSEaim8uw2dane/UYZbNoJRgzbgJR3V6+r+I3xrIEJJhpy86s59J8uc6Y"
				+ "whAf6Ud9GjIVVawcCEoWRpFNNHc6NLzOHJ4wc+K6ehqkTdtnDRw+znmNdg3L8fYA8b36cza9bS6/xQ98bR2"
				+ "QGN1e05DDqBjqSoEe85uVi9fRG1FJ6u+cJVT+CziLKcFx/lKa9lWWnirBSUj0Ob3GOSjDdhJ/CaZ8"
				+ "Dk+RkxCITyTcvvkuC9HlRisLavYsOKMamUGwJ5AXU1Q2wS+vr9Y+zNwBlAkf5LIgmZtT3MtLMCV"
				+ "JhDAOJoLFiziMmtc3CKX9YRl+IPuzDOFeFpKTIlNX3ysTjh+xYhe/Ij4EB+YUFwr/dE=";
		HttpEntity entity = new StringEntity(
				passwd,
				Consts.UTF_8);
		post.setEntity(entity);

		HttpResponse response = client.execute(post);
		System.out.println(EntityUtils.toString(response.getEntity()));
	}

}
