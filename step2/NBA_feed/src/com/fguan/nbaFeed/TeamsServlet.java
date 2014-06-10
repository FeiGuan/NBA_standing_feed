package com.fguan.nbaFeed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

public class TeamsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		List<JSONObject> jsonList = new ArrayList<JSONObject>();

		String[] teamNames = { "Celtics", "Nets", "Knicks", "76ers", "Raptors",
				"Bulls", "Cavaliers", "Pistons", "Pacers", "Bucks", "Hawks",
				"Hornets", "Heat", "Magic", "Wizards", "Mavericks", "Rockets",
				"Grizzlies", "Pelicans", "Spurs", "Nuggets", "Timberwolves",
				"Trail Blazers", "Thunder", "Jazz", "Warriors", "Clippers",
				"Lakers", "Suns", "Kings" };

		int[] teamWins = { 25, 44, 37, 19, 48, 48, 33, 29, 56, 15, 38, 43, 52,
				23, 44, 49, 54, 50, 34, 62, 36, 40, 54, 59, 25, 51, 57, 27, 48,
				28 };
		
		

		for (int i = 0; i < 30; i++) {
			JSONObject currentObj = new JSONObject();
			try {
				currentObj.put("name", teamNames[i]);
				currentObj.put("win", teamWins[i]);
				currentObj.put("lose", 82 - teamWins[i]);
				currentObj.put("percent", teamWins[i] * 100 / 82);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jsonList.add(currentObj);
		}
		resp.getWriter().print(jsonList);
	}
}
