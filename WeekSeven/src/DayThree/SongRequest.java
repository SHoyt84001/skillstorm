package DayThree;

import java.util.PriorityQueue;

// comparable means that any of the songreqest obnjects have the ability to be compared with a songrequest
public class SongRequest implements Comparable<SongRequest>{
	
	private Song song; // a songReqest HAS-A song associated with it
	private double bidAmount;
	
	public SongRequest(Song song) {
		this.song = song;
	}

	public SongRequest(Song song, double bidAmount) {
		this.song = song;
		this.bidAmount = bidAmount;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}
	
	/*
	 *  compares object itself to the song request object
	 *  
	 *  compares two objects: THIS and THAT
	 *  
	 *  determines if THIS is greater than, less than, or equal to THAT
	 *  
	 *  returns int where: 
	 *   - negative number represents that THIS is less than THAT
	 *   - positive numbers represents that THIS is more than THAT
	 *   - if 0, then THIS and THAT are equal
	 */
	
//	@Override
//	public int compareTo(SongRequest song) {
//		if (this.bidAmount == that.bidAmount) {
//			
//		}
//		return 0;
//	}
	
	/* Used to store my SongRequest in a queue determined by bidAmount
	 * 
	 * PriorityQueue - FIFO
	 *  - When i add and elemenet to t a priorityQueue, Java compares 
	 *  the newly added element with each other of the other elements
	 *  in order to determine its "rank"
	 *  
	 *  - Elements with higher priority can jump to the front of the queue
	 *  
	 *  by Priority mans based on levels
	 *   - "lower" numbers are higher priority
	 *   - level 1 is most important
	 *  
	 *  if my priorityQueue is based off of bidAmount, then I want the higher bids to jump to the front of the line
	 *  or ahead of the lesser bids
	 *  
	 *  Cannot add items to a priorityQueue unless it implements the comparable interface
	 */
	
	public static void main(String[] args) {
		PriorityQueue<SongRequest> songQueue = new PriorityQueue<>();
		SongRequest steveRequest = new SongRequest(new Song("Africa", "toto"), 30);
	}

	@Override
	public int compareTo(SongRequest o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
