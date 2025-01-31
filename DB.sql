

--

CREATE TABLE `bank` (
  `id` int(11) NOT NULL,
  `bname` varchar(25) DEFAULT NULL,
  `link1` varchar(100) DEFAULT NULL,
  `link2` varchar(100) DEFAULT NULL,
  `acnumber` bigint(20) DEFAULT NULL,
  `anouncementA` varchar(500) DEFAULT NULL,
  `anouncementC` varchar(250) DEFAULT NULL,
  `IFSC` varchar(20) DEFAULT NULL,
  `date` varchar(15) DEFAULT NULL,
  `sadmin` varchar(25) DEFAULT NULL,
  `spassword` varchar(25) DEFAULT NULL,
  `name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`id`, `bname`, `link1`, `link2`, `acnumber`, `anouncementA`, `anouncementC`, `IFSC`, `date`, `sadmin`, `spassword`, `name`) VALUES
(1, 'PCPCI BANK', 'https://forms.gle/G5KnK3UMFmkr59pQ7', 'https://forms.gle/G5KnK3UMFmkr59pQ7', 1586742535441, 'respect customers and do the work with proper care complete all the remaining work before comming saturday', 'new features are comming soon please try to communicate through the request if you have any doubts', 'BANKTEMP1234', '12-08-2022', 'loginid', 'password', 'Bharath S J');

-- --------------------------------------------------------

--
-- Table structure for table `dlogin`
--

CREATE TABLE `dlogin` (
  `id` int(11) NOT NULL,
  `userid` varchar(15) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id` int(11) NOT NULL,
  `acnumber` bigint(20) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `ammount` int(11) DEFAULT NULL,
  `date` varchar(25) DEFAULT NULL,
  `ex1` int(11) DEFAULT NULL,
  `ex2` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- --------------------------------------------------------

--
-- Table structure for table `tracking`
--

CREATE TABLE `tracking` (
  `datee` varchar(11) DEFAULT NULL,
  `dayy` varchar(11) DEFAULT NULL,
  `monthh` varchar(11) DEFAULT NULL,
  `yearr` varchar(11) DEFAULT NULL,
  `inn` bigint(11) DEFAULT 0,
  `outt` bigint(11) DEFAULT 0,
  `acc1` int(11) DEFAULT 0,
  `acc2` int(11) DEFAULT 0,
  `comp1` int(11) DEFAULT 0,
  `comp2` int(11) DEFAULT 0,
  `temp` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `number` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `dob` varchar(15) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `father` varchar(25) DEFAULT NULL,
  `mother` varchar(25) DEFAULT NULL,
  `adhar` varchar(25) DEFAULT NULL,
  `pan` varchar(15) DEFAULT NULL,
  `balance` int(12) DEFAULT NULL,
  `acnumber` bigint(15) DEFAULT NULL,
  `userid` varchar(10) DEFAULT NULL,
  `complain` varchar(1000) DEFAULT NULL,
  `reason` varchar(500) DEFAULT NULL,
  `accdate` varchar(15) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `gender` varchar(11) DEFAULT NULL,
  `age` varchar(11) DEFAULT NULL,
  `compdate` varchar(15) DEFAULT NULL,
  `responce` varchar(500) DEFAULT NULL,
  `deletion` int(11) DEFAULT NULL,
  `banktype` varchar(25) DEFAULT NULL,
  `actype` varchar(25) DEFAULT NULL,
  `block` int(11) DEFAULT 0,
  `remainammount` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- Indexes for dumped tables
--

--
-- Indexes for table `bank`
--
ALTER TABLE `bank`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dlogin`
--
ALTER TABLE `dlogin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tracking`
--
ALTER TABLE `tracking`
  ADD PRIMARY KEY (`temp`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bank`
--
ALTER TABLE `bank`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `dlogin`
--
ALTER TABLE `dlogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;

--
-- AUTO_INCREMENT for table `tracking`
--
ALTER TABLE `tracking`
  MODIFY `temp` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

