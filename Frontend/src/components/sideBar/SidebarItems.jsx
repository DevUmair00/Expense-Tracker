import {
  House,
  FileText,
  Tags,
  ChartNoAxesCombined,
  Settings,
  LogOut,
} from "lucide-react";


import Item from "./Item";

const SidebarItems = () => {
  const links = [
    {
      title: "Dashboard",
      path: "/dashboard",
      icon: House,
    },
    {
      title: "Transactions",
      path: "/transactions",
      icon: FileText,
    },
    {
      title: "Categories",
      path: "/categories",
      icon: Tags,
    },
    {
      title: "Reports",
      path: "/reports",
      icon: ChartNoAxesCombined,
    },
    {
      title: "Settings",
      path: "/settings",
      icon: Settings,
    },
    {
      title: "Logout",
      path: "/logout",
      icon: LogOut,
    }
  ];

  return (
    <div className="pt-4 py-4">
      {links.map((link) => (
        <Item
          key={link.path}
          title={link.title}
          path={link.path}
          icon={link.icon}
        />
      ))}
    </div>
  );
};

export default SidebarItems;




