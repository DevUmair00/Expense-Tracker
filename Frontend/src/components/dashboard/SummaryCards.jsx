import Card from "./Card";

const SummaryCards = () => {
  const cards = [
    {
      title: "Total Balance",
      value: "$24,250",
      change: "12.5%",
      icon: "MdAccountBalanceWallet",
    },
    {
      title: "Total Income",
      value: "$48,750",
      change: "8.3%",
      icon: "MdAccountBalanceWallet",
    },
    {
      title: "Total Expense",
      value: "$20,750",
      change: "8.3%",
      icon: "MdAccountBalanceWallet",
    },
    {
      title: "Monthly Saving",
      value: "$4,00",
      change: "8.3%",
      icon: "MdAccountBalanceWallet",
    },
  ];

  return (
    <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 px-6 py-14 gap-6">
      {cards.map((card, index) => (
        <Card
          key={index}
          title={card.title}
          value={card.value}
          change={card.change}
          icon={card.icon}
        />
      ))}
    </div>
  );
};

export default SummaryCards;
