package Game.Rooms;

public class NoteRoom extends Room{
   
   public NoteRoom(boolean right, boolean left, boolean up, boolean down, String note){
      super(right, left, up, down);
      this.note = note;
   }

   public void printNote(String note){
      
   }
}
