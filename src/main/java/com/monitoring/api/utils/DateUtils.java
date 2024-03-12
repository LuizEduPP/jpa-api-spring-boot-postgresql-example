package com.monitoring.api.utils;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class DateUtils {

	/**
	 * Formata {@link Duration} para {@link String} no formato: HH:mm:ss.
	 *
	 * @param duration {@link Duration}: a data a ser convertida em {@link String}
	 * @return {@link String}
	 */
	public static String formatDuration(Duration duration) {
		long seconds = duration.getSeconds();
		long absSeconds = Math.abs(seconds);
		String positive = String.format("%d:%02d:%02d", absSeconds / 3600, (absSeconds % 3600) / 60, absSeconds % 60);
		return seconds < 0 ? "-" + positive : positive;
	}

	/**
	 * Formata {@link Date} para {@link String} no formato: dd-MM-yyyy.
	 *
	 * @param data {@link Date}: a data a ser convertida em {@link String}
	 * @return {@link String}
	 */
	public static String formataData(Date data) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.format(data);
	}
}
