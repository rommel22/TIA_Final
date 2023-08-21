<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
  <style>
    @import url('https://fonts.googleapis.com/css2?family=Sriracha&display=swap');

    body {
        margin: 0;
        box-sizing: border-box;
        font-family: Arial, Helvetica, sans-serif;
    }

    .topnav {
        overflow: hidden;
        background-color: #333;
    }

    .topnav a {
        float: left;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 17px;
    }

    .topnav a:hover {
        background-color: #ddd;
        color: black;
    }

    .topnav a.active {
        background-color: #fcba03;
        color: white;
    }

    /* CSS for main element */
    .intro {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      width: 100%;
      height: 520px;
      background: linear-gradient(to bottom, rgba(0, 0, 0, 0.5) 0%, rgba(0, 0, 0, 0.5) 100%), url("https://www.bnnbloomberg.ca/polopoly_fs/1.1562612!/fileimage/httpImage/image.jpeg_gen/derivatives/landscape_620/market-one-polished-glowing-surface-of-meteorite-composed-by-high-density-heavy-metals-mostly-ir.jpeg");
      background-size: cover;
      background-position: center;
      background-repeat: no-repeat;
    }

    .intro h1 {
        font-family: Arial, Helvetica, sans-serif;
        font-size: 60px;
        color: #fff;
        font-weight: bold;
        text-transform: uppercase;
        margin: 0;
    }

    .intro p {
      font-size: 20px;
      color: #d1d1d1;
      text-transform: uppercase;
      margin: 20px 0;
    }

    .intro button {
      background-color: #5edaf0;
      color: #000;
      padding: 10px 25px;
      border: none;
      border-radius: 5px;
      font-size: 20px;
      font-weight: bold;
      cursor: pointer;
      box-shadow: 0px 0px 20px rgba(255, 255, 255, 0.4)
    }

    .achievements {
      display: flex;
      justify-content: space-around;
      align-items: center;
      padding: 40px 80px;
    }

    .achievements .work {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      padding: 0 40px;
    }

    .achievements .work i {
      width: fit-content;
      font-size: 50px;
      color: #333333;
      border-radius: 50%;
      border: 2px solid #333333;
      padding: 12px;
    }

    .achievements .work .work-heading {
      font-size: 20px;
      color: #333333;
      text-transform: uppercase;
      margin: 10px 0;
    }

    .achievements .work .work-text {
      font-size: 15px;
      color: #585858;
      margin: 10px 0;
    }

    .about-me {
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 40px 80px;
      border-top: 2px solid #eeeeee;
    }

    .about-me img {
      width: 500px;
      max-width: 100%;
      height: auto;
      border-radius: 10px;
    }

    .about-me-text h2 {
      font-size: 30px;
      color: #333333;
      text-transform: uppercase;
      margin: 0;
    }

    .about-me-text p {
      font-size: 15px;
      color: #585858;
      margin: 10px 0;
    }

    /* CSS for footer */
    .footer {
      display: flex;
      justify-content: space-between;
      align-items: center;
      background-color: #333;
      padding: 40px 80px;
    }

    .footer .copy {
      color: #fff;
    }

    .bottom-links {
      display: flex;
      justify-content: space-around;
      align-items: center;
      padding: 40px 0;
    }

    .bottom-links .links {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      padding: 0 40px;
    }

    .bottom-links .links span {
      font-size: 20px;
      color: #fff;
      text-transform: uppercase;
      margin: 10px 0;
    }

    .bottom-links .links a {
      text-decoration: none;
      color: #a1a1a1;
      padding: 10px 20px;
    }
  </style>
</head>

<body>
    <div class="topnav">
        <a class="active" href="Main.jsp">Home</a>
        <a href="ShowTMM">Data</a>
        <a href="InsertTMM">Form</a>
        <a href="Predict">Predict</a>
        <a href="About.jsp">About</a>
      </div>
  <main>
    <div class="intro">
      <h1>Web Pengolahan Nikel</h1>
      <p>Website Penentuan Suhu Tungku Putar Untuk Otomasi Operasi Tungku Putar Teknologi STAL.</p>
    </div>
    <div class="achievements">
      <div class="work">
        <i class="fas fa-atom"></i>
        <p class="work-heading">Latar Belakang</p>
        <p class="work-text">Mineral logam memiliki peran penting dalam menopang perekonomian, salah satu logam yang sering dimanfaatkan dalam industri adalah nikel. Saat ini dengan pengembangan teknologi kendaraan listrik, permintaan nikel sangat tinggi.</p>
        <p class="work-text">Indonesia memiliki cadangan nikel terbesar di dunia saat ini, yaitu sekitar 52% atau 72 ton dari cadangan nikel dunia. Logam nikel terdapat 2 macam yaitu bijih nikel sulfida dan bijih nikel laterit.</p>
      </div>
      <div class="work">
        <i class="fas fa-skiing"></i>
        <p class="work-heading">Pengolahan Nikel</p>
        <p class="work-text">Pengolahan nikel laterit terdapat 2 cara yaitu dengan proses pirometalurgi dan proses hidrometalurgi.</p>
        <p class="work-text">Akan tetapi 2 proses tersebut sangat merusak lingkungan dan boros energi, oleh karena it terdapat Teknologi STAL</p>
      </div>
      <div class="work">
        <i class="fas fa-ethernet"></i>
        <p class="work-heading">Teknologi STAL</p>
        <p class="work-text">Proses STAL atau Step Temperature Acid Leach yang merupakan teknologi pengolahan mineral berbasis hidrometalurgi yang inovatif berbiaya rendah, efisien, zero-waste.</p>
        <p class="work-text">Dan proses ini digunakan menghasilkan nikel kelas 1 dengan kandungan nikel lebih dari 98% untuk dijadikan sebagai baterai kendaraan listrik</p>
      </div>
    </div>
    <div class="about-me">
      <div class="about-me-text">
        <h2>Permasalahan</h2>
        <p>Akan tetapi proses STAL saat ini belum dapat dilakukan dengan otomatis, pengaturan dan kontrol suhu masilh dilakukan dengan cara manual sehingga hasil nikel tidak konsisten dan membuang buang energi, hal ini disebabkan karena suhu tungku putar tidak konsisten dan pengolahan nikel membutuhkan suhu tertentu.</p>
      </div>
      <img src="data:image/jpeg;base64,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" alt="me">
    </div>
  </main>
  <footer class="footer">
    <div class="copy">&copy; 2022 Developer</div>
    <div class="bottom-links">
      <div class="links">
        <span>More Info</span>
        <a href="#">Home</a>
        <a href="#">About</a>
        <a href="#">Contact</a>
      </div>
      <div class="links">
        <span>Social Links</span>
        <a href="#"><i class="fab fa-facebook"></i></a>
        <a href="#"><i class="fab fa-twitter"></i></a>
        <a href="#"><i class="fab fa-instagram"></i></a>
      </div>
    </div>
  </footer>
</body>

</html>