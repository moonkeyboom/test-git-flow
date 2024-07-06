public class Wallet {
		private double amount;
		private double cumulativePurchase;
		private int point;
		private ArrayList<String> history; // มี package ที่ต้อง import เพิ่ม
					/* นิสิตอาจสร้างคลาสสำหรับประวัติการทำธุรกรรมเพื่อนำมาใข้ได้ */
					/* แต่ถ้า skill ยังไม่ถึง ให้เก็บประสบการณ์ไปก่อน */

		public void topUp(double amount) {
				// เติมเงิน

				// เก็บประวัติการเติมเงิน (optional)
    }

		public void purchase(double spent) {
				// ตัดเงิน

				// เพิ่มยอดใช้จ่ายสะสม

				// คำนวณการสะสมแต้มจากยอดใช้จ่าย

				// เก็บประวัติการใช้จ่าย (optional)
    }

		public void usePoint(int point) {
				// คำนวณการใช้แต้ม

				// เก็บประวัติการใช้แต้ม (optional)
    }

		// getters
}