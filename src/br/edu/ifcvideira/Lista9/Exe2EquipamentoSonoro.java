package br.edu.ifcvideira.Lista9;

public class Exe2EquipamentoSonoro extends Exe2Equipamento{

	private int volume;
	private boolean stereo;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume <= 10 || volume >=0) {
			this.volume = volume;
		}
	}
	public boolean isStereo() {
		return stereo;
	}
	public void setStereo(boolean stereo) {
		this.stereo = stereo;
	}
	public void mono() {
		this.setStereo(false);
	}
	public void stereo() {
		this.setStereo(true);
	}
	public void liga() {
		this.setVolume(5);
		super.liga();
	}
}
