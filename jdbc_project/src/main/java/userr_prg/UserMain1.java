package userr_prg;

import java.util.Scanner;

public class UserMain1 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		User1 user = new User1();
		User1Crud crud = new User1Crud();

		do {
			System.out.println("1. to signup");
			System.out.println("2. to login");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter the user id");
				int id = scanner.nextInt();
				System.out.println("Enter the user name");
				String username = scanner.next();
				System.out.println("Enter the email");
				String emailid = scanner.next();
				System.out.println("Enter the password");
				String password = scanner.next();
				System.out.println("Enter the address");
				String address = scanner.next();

				user.setUserid(id);
				user.setUsername(username);
				user.setEmailid(emailid);
				user.setPassword(password);
				user.setAddress(address);

				crud.signUpUser(user);
			}
				break;

			case 2: {
				System.out.println("Enter the EMAIL");
				String emailid = scanner.next();
				System.out.println("Enter the password");
				String password = scanner.next();

				user.setEmailid(emailid);
				user.setPassword(password);

				boolean result = crud.loginUser(user);
				if (result == true) {
					System.out.println("Logged in successfully");
					System.out.println("1 : To Signup Facebook");
					System.out.println("2 : To Signup Instagram");
					System.out.println("3 : To Signup Snapchat");
					System.out.println("4 : To Signup Twitter");
					System.out.println("5 : To Signup Whatsapp");
					System.out.println("Enter your choice");
					int login = scanner.nextInt();
					switch (login) {
					case 1: {
						System.out.println("Enter the facebok password");
						String facebokpassword = scanner.next();

						int saved = crud.signUpFacebok(emailid, facebokpassword);
						if (saved == 1) {
							System.out.println("Facebookpassword added successfully");
							boolean flag = true;
							do {
								System.out.println("1: to reset the facebook password");
								System.out.println("2: to logout facebook");
								int reset = scanner.nextInt();
								switch (reset) {
								case 1: {
									System.out.println("Enter the password to be reset");
									String resetpassword = scanner.next();
									int save = crud.signUpFacebok(emailid, resetpassword);
									if (save == 1)
										System.out.println("password reseted successfully");
									else
										System.out.println("password not reseted");
								}
									break;
								case 2: {
									flag = false;
									System.out.println("Exit");
								}
									break;
								default:
									System.out.println("Invalid choice");
								}
							} while (flag);

						} else
							System.out.println("Facebookpassword not added");

					}
						break;
					case 2: {
						System.out.println("Enter the Insta password");
						String instapassword = scanner.next();

						int saved = crud.signUpInsta(emailid, instapassword);
						if (saved == 1) {
							System.out.println("Insta password added successfully");
							boolean flag = true;
							do {
								System.out.println("1: to reset the Instagram password");
								System.out.println("2: to logout Instagram");
								int reset = scanner.nextInt();
								switch (reset) {
								case 1: {
									System.out.println("Enter the password to be reset");
									String resetpassword = scanner.next();
									int save = crud.signUpFacebok(emailid, resetpassword);
									if (save == 1)
										System.out.println("password reseted successfully");
									else
										System.out.println("password not reseted");
								}
									break;
								case 2: {
									flag = false;
									System.out.println("Exit");
								}
									break;
								default:
									System.out.println("Invalid choice");
								}
							} while (flag);
						}

						else
							System.out.println("Instagram password not added");
					}
						break;
					case 3: {
						System.out.println("Enter the Snapchat password");
						String snappassword = scanner.next();

						int saved = crud.signUpSnap(emailid, snappassword);
						if (saved == 1) {
							System.out.println("Snapchat password added successfully");
							boolean flag = true;
							do {
								System.out.println("1: to reset the Snapchat password");
								System.out.println("2: to logout Snapchat");
								int resetchoice = scanner.nextInt();
								switch (resetchoice) {
								case 1: {
									System.out.println("Enter the password to be reset");
									String reset = scanner.next();
									int save = crud.signUpFacebok(emailid, reset);
									if (save == 1)
										System.out.println("password reseted successfully");
									else
										System.out.println("password not reseted");
								}
									break;
								case 2: {
									flag = false;
									System.out.println("Exit");
								}
									break;
								default:
									System.out.println("Invalid choice");
								}
							} while (flag);
						}

						else
							System.out.println("Snapchat password not added");
					}
						break;

					case 4: {
						System.out.println("Enter the twitter password");
						String twitterpassword = scanner.next();

						int saved = crud.signUpTwitter(emailid, twitterpassword);
						if (saved == 1) {
							System.out.println("twitter password added successfully");
							boolean flag = true;
							do {
								System.out.println("1: to reset the twitter password");
								System.out.println("2: to logout twitter");
								int reset = scanner.nextInt();
								switch (reset) {
								case 1: {
									System.out.println("Enter the password to be reset");
									String resetpassword = scanner.next();
									int save = crud.signUpFacebok(emailid, resetpassword);
									if (save == 1)
										System.out.println("password reseted successfully");
									else
										System.out.println("password not reseted");
								}
									break;
								case 2: {
									flag = false;
									System.out.println("Exit");
								}
									break;
								default:
									System.out.println("Invalid choice");
								}
							} while (flag);
						}

						else
							System.out.println("twitter password not added");
					}
						break;

					case 5: {
						System.out.println("Enter the whatsapp password");
						String whatsappassword = scanner.next();

						int saved = crud.signUpWhatsapp(emailid, whatsappassword);
						if (saved == 1) {
							System.out.println("whatsapp password added successfully");
							boolean flag = true;
							do {
								System.out.println("1: to reset the whatsapp password");
								System.out.println("2: to logout whatsapp");
								int resetchoice = scanner.nextInt();
								switch (resetchoice) {
								case 1: {
									System.out.println("Enter the password to be reset");
									String resetpassword = scanner.next();
									int save = crud.signUpFacebok(emailid, resetpassword);
									if (save == 1)
										System.out.println("password reseted successfully");
									else
										System.out.println("password not reseted");
								}
									break;
								case 2: {
									flag = false;
									System.out.println("Exit");
								}
									break;
								default:
									System.out.println("Invalid choice");
									break;
								}
							} while (flag);
						}

						else
							System.out.println("whatsapp password not added");
					}
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				} else
					System.out.println("Invalid password");

			}
				break;
			default: {
				repeat = false;
				System.out.println("Exit");
			}

			}

		} while (repeat);

	}
}
