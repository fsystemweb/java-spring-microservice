USE [institute]
GO
/****** Object:  User [javauser]    Script Date: 27/03/2020 11:53:38 ******/
CREATE USER [javauser] FOR LOGIN [javauser] WITH DEFAULT_SCHEMA=[dbo]
GO
ALTER ROLE [db_owner] ADD MEMBER [javauser]
GO
ALTER ROLE [db_accessadmin] ADD MEMBER [javauser]
GO
ALTER ROLE [db_securityadmin] ADD MEMBER [javauser]
GO
ALTER ROLE [db_ddladmin] ADD MEMBER [javauser]
GO
ALTER ROLE [db_backupoperator] ADD MEMBER [javauser]
GO
ALTER ROLE [db_datareader] ADD MEMBER [javauser]
GO
ALTER ROLE [db_datawriter] ADD MEMBER [javauser]
GO
ALTER ROLE [db_denydatareader] ADD MEMBER [javauser]
GO
ALTER ROLE [db_denydatawriter] ADD MEMBER [javauser]
GO
/****** Object:  Table [dbo].[course]    Script Date: 27/03/2020 11:53:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[course](
	[courseid] [varchar](255) NOT NULL,
	[author] [varchar](255) NULL,
	[coursename] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[courseid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
